Build:

* Clone this project
* Download the android comScore sdk from [here](http://direct.comscore.com/clients/Ajax.ashx/Sdk/GetFile?fileName=androidsdk&outputFilename=)
* Copy comscore.jar into native/android
* Download the ios comScore sdk from [here](http://direct.comscore.com/clients/Ajax.ashx/Sdk/GetFile?fileName=iossdk&outputFilename=)
* Copy libcomScore.a and all header files into native/ios
* Build the project, it shall generate dist/comScore.cn1lib

Installation and usage:

* Copy the generated dist/comScore.cn1lib into your projects lib folder
* Refresh libs
* Add SystemConfiguration.framework;Security.framework to the ios.add_libs property
* Add <PRE><uses-permission android:name="android.permission.INTERNET" /> <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" /> <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" /></PRE> to the android.xpermissions property
* In the main class init method:
	```java
	comScore.init(context);
	```
* Then:
	```java
	comScore.setCustomerC2("1234567");
	comScore.setPublisherSecret("your publisher secret");
	```

Please notice that the usage statistics may take a few hours to be available in the comScore interface.
