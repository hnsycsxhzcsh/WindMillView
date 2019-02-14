# WindMillView
Android自定义控件WindMillView，天气风车效果

<a href="https://github.com/hnsycsxhzcsh/WindMillView/blob/master/mysrc/windmill.apk">Download Apk</a>

Rendering</br>
效果图

<img src="https://github.com/hnsycsxhzcsh/WindMillView/blob/master/mysrc/windmill.gif" width="300" height="612">

The method referenced in the project:</br>
项目中引用的方法：

### Step 1. Add the JitPack repository to your build file </br>
步骤1.将JitPack存储库添加到构建文件中</br>
项目的根build.gradle中添加以下代码：
```Java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
### Step 2. Add the dependency</br>
步骤2.build.gradle添加依赖项
```Java
	dependencies {
	        implementation 'com.github.hnsycsxhzcsh:WindMillView:v1.1'
	}
```
### Step 3. Reference control in layout</br>
步骤3. 布局中引用控件
```Java
<com.windmillview.WindMillView
            android:id="@+id/wm1"
            android:layout_width="100dp"
            android:layout_height="120dp"
            app:windColor="@color/white" />
```
If my control helps you, please help click on the top right corner, thank you!</br>
### <font color="#FF0000">如果有帮助到大家希望点下右上角Star，谢谢！</font>

[![](https://www.jitpack.io/v/hnsycsxhzcsh/WindMillView.svg)](https://www.jitpack.io/#hnsycsxhzcsh/WindMillView)
