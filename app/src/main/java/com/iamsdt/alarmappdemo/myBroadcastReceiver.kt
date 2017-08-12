package com.iamsdt.alarmappdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
* Created by Shudipto Trafder on 8/12/2017.
*/
class myBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        if (intent!!.action == "com.tester.alarmmanager"){
            val b=intent.extras
            // Toast.makeText(context,b.getString("message"),Toast.LENGTH_LONG).show()
            val notifyMe=Notifications()
            notifyMe.Notify(context!!,b.getString("message"),10)
        }
        else if(intent.action == "android.intent.action.BOOT_COMPLETED"){
            val saveData=SaveData(context!!)
            saveData.setAlarm()
        }
    }

}