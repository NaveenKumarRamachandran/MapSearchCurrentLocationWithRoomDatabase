# MapSearchCurrentLocationWithRoomDatabase

	Need a Google credentials Api key enable Map,places library
	https://console.cloud.google.com/apis/credentials
	
Android Map Search  and get current Location Store data in  Room Database


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

Screenshots
![screenshot (6)](https://user-images.githubusercontent.com/24818899/60151352-12878400-97fa-11e9-8e95-1dcebffa558e.png)
![screenshot (1)](https://user-images.githubusercontent.com/24818899/60151189-6ba2e800-97f9-11e9-9e46-5028423d573c.png)
![screenshot (2)](https://user-images.githubusercontent.com/24818899/60151190-6ba2e800-97f9-11e9-80a3-ff3d743dddba.png)
![screenshot (3)](https://user-images.githubusercontent.com/24818899/60151191-6ba2e800-97f9-11e9-9c7d-cd8e35bd5330.png)
![screenshot (4)](https://user-images.githubusercontent.com/24818899/60151192-6c3b7e80-97f9-11e9-8c8c-b86c0bae9fb6.png)
![screenshot (5)](https://user-images.githubusercontent.com/24818899/60151351-11eeed80-97fa-11e9-8dac-452e9c98a931.png)


