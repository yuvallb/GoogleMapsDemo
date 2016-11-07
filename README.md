# Google Maps Demo

This is an Android Studio project demonstrating basic usage of Google Maps API and reading data from a CSV file.

The app will require location permissions, set the current location, and load 100 markers from a CSV file.

## Using ITM (רשת ישראל חדשה) with Google Maps ## 

ITM is X,Y coordinates on the Israel map.

Most GIS data available for Israel is only in ITM.

WGS84 is the absolute global location, and is used by all GPS devices and Google Maps.

There are two methods to convert ITM to WGS84, the first is complex and inaccurate, the second is very complex but very accurate.
see: 
http://tx.technion.ac.il/~zvikabh/software/ITM/
http://www.systematics.co.il/wp-content/uploads/ITM2WGS84_Transformation1.pdf
http://www.4x4.co.il/usercontent/UserFiles/CoordinatConvert.xls


## Reference ##

https://developer.android.com/training/building-location.html

https://developers.google.com/maps/documentation/android-api/start
