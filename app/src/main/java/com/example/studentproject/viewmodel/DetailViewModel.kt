package com.example.studentproject.viewmodel

import android.app.Application
import com.android.volley.RequestQueue

class DetailViewModel(application: Application):
    AndroidViewModel(application) {
    val studentLD = MutableLiveData<Student>()
    private var TAG = "volley_TAG"
    private var queue: RequestQueue?= null

    fun fetch() {
        val url = "https://www.jsonkeeper.com/b/LLMN"
        /*val student1 = Student("16055","Nonie","1998/03/28","5718444778",
            "http://dummyimage.com/75x100.jpg/cc0000/ffffff") */
        //studentLD.value = student1
    }


}