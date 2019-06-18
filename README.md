# MapSearchCurrentLocationWithRoomDatabase

	Need a Google credentials Api key enable Map,places library
	https://console.cloud.google.com/apis/credentials
	
Android Map Search  and get current Location Store data in  Room Database


Google Map Search 
![Screenshot_20190613-002502](https://user-images.githubusercontent.com/24818899/59404402-034d1300-8dc4-11e9-9755-f5da189e889f.png)

Room DataBase 
![Screenshot_20190613-002520](https://user-images.githubusercontent.com/24818899/59404360-e57fae00-8dc3-11e9-8046-bebd73578ee8.png)


Gradle libraries for google map 

	implementation 'com.google.android.gms:play-services-maps:16.1.0'

	implementation 'com.google.android.gms:play-services-places:16.0.0'

	implementation 'com.google.android.libraries.places:places:1.1.0'

 // Room components
   	
	implementation "android.arch.persistence.room:runtime:$rootProject.roomVersion"
    
    kapt "android.arch.persistence.room:compiler:$rootProject.roomVersion"
    
    androidTestImplementation "android.arch.persistence.room:testing:$rootProject.roomVersion"
    
    // Lifecycle components
    implementation "android.arch.lifecycle:extensions:$rootProject.archLifecycleVersion"
    
    kapt "android.arch.lifecycle:compiler:$rootProject.archLifecycleVersion"
    
    // Coroutines
    api "org.jetbrains.kotlinx:kotlinx-coroutines-core:$rootProject.coroutines"
    
    api "org.jetbrains.kotlinx:kotlinx-coroutines-android:$rootProject.coroutines"

Places search required a amount billing account in google at add a bill amount for querying
https://console.cloud.google.com/apis/dashboard
