This project is for consuming passtime for Internationalspace station. 
It will colect the Lat long from the device and send it to the server to get the data from ISS 
and display your current Location Lat long and time along with the Passtime and duration. 



1: Used Volley for Rest api call.
2: Separate SDK (networksdk) developed as a module for Network call , this was developed as a wrapper on top of volley.
3: Implemented MVP just to demonstrate 
4: Used Dagger as needed just to demonstrate. 
5: Thought of implementing all the apis are available on ISS but didn't get enough time to demonstrate 
6: Tested all the edge cases as much as possible. 
7: Implemented 2 types of GPS service one from android.location package another from android.gms.location package . Some device need to upgrade playservice for gms.location package so just made fallback service.
8: Didn't get enough time to write unit test cases.
9: Passtime data is not in shorted order it also can possible
I have tried to implement as much as possible with in the time frame.