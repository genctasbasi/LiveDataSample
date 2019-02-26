# LiveDataSample
A sample Android LiveData app to demonstrate the simple use of LiveData

This is the simplest-ever LiveData sample. It has one Activity and a ViewModel. ViewModel has a LiveData object which is observed by the Activity.

![Android LiveData diagram](http://genct.com/wp-content/uploads/2019/02/livedata_diagram.png)

When you run the app, Activity simply sets a value for a TextView and assigns itself as an observer to the ViewModel:

![Initial value](http://genct.com/wp-content/uploads/2019/02/livedata_sample_1.png)

Then, when you tap the button, a new value is set from within the ViewModel and Activity is notified. As a result, the new value set is displayed on the Activity:

![Value after LiveData changes value](http://genct.com/wp-content/uploads/2019/02/livedata_sample_2.png)

