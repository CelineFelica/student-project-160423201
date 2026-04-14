package com.example.studentproject.viewmodel

import android.app.Application
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.StringRequest
import java.lang.reflect.Method

class DetailViewModel(application: Application):
    AndroidViewModel(application) {
    val studentLD = MutableLiveData<Student>()
    private var TAG = "volley_TAG"
    private var queue: RequestQueue?= null

    fun fetch(id: String) {
        val url = "https://www.jsonkeeper.com/b/LLMN"

        var stringRequest = StringRequest(Request, Method.GET, url,
            {
                val sType = object: TypeToken<List<Student>>(){}.type
                val result = Gson().fromJson<List<Student>>(it, sType)
                val students = result as ArrayList<Student>
                studentLD.value = students.find{it.id == id}
            },
            {
                Log.e("volley_status", it.message.toString())
            })
        StringRequest.tag = TAG
        queue?.add(stringRequest)

        /*val student1 = Student("16055","Nonie","1998/03/28","5718444778",
            "http://dummyimage.com/75x100.jpg/cc0000/ffffff") */
        //studentLD.value = student1
    }


}