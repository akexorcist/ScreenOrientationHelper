[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.akexorcist/screenorientationhelper/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.akexorcist/screenorientationhelper)

# ScreenOrientationHelper
Screen orientation event listener helper for activity

Use onCofigurationChanged() doesn't works for detected screen orientation. That made configuration change doesn't works when user rotate the screen. So I build this library to solved the problem with better solution.

Download
===============================

Maven
```
<dependency>
  <groupId>com.akexorcist</groupId>
  <artifactId>screenorientationhelper</artifactId>
  <version>1.0.0</version>
</dependency>
```

Gradle
```
compile 'com.akexorcist:screenorientationhelper:1.0.0'
```

Usage
===============================
This library should be implemented on base activity class that you want to detect the screen orientation
```java
public class BaseActivity extends AppCompatActivity implements ScreenOrientationHelper.ScreenOrientationChangeListener {
    private ScreenOrientationHelper helper = new ScreenOrientationHelper(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        helper.onCreate(savedInstanceState);
        helper.setScreenOrientationChangeListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        helper.onStart();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        helper.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        helper.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onScreenOrientationChanged(int orientation) {

    }

    ...
}
```

Then extends your activity from this base class and override the onScreenOrientationChanged method
```java
public class MainActivity extends BaseActivity {

    ...

    @Override
    public void onScreenOrientationChanged(int orientation) {
        // Do something when screen orientation changed
    }
}
```
Done! So easy, right?


Licence
===========================
Copyright 2017 Akexorcist

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this work except in compliance with the License. You may obtain a copy of the License in the LICENSE file, or at:

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.



