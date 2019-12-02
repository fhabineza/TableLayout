package com.example.tablelayout

import android.graphics.Color
import android.graphics.Paint
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RectShape
import android.os.Bundle
import android.view.View
import android.widget.Space
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mt = findViewById(R.id.myTbl) as TableLayout
        mt.setBackgroundColor(Color.rgb(233, 30, 99))

        val shp = ShapeDrawable()
        shp.shape = RectShape()
        shp.paint.color = Color.BLACK
        shp.paint.strokeWidth = 10f
        shp.paint.style = Paint.Style.STROKE




        t1.setBackground(shp)
        t2.setBackground(shp)
        t3.setBackground(shp)
        t4.setBackground(shp)
        t5.setBackground(shp)
        t6.setBackground(shp)


    }

    fun addRow(view: View) {

        // Create a new table row.
        val tableRow = TableRow(getApplicationContext())

        // Set new table row layout parameters.
        val layoutParams = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT,
            2f
        )
        tableRow.setLayoutParams(layoutParams)

        //TABLE BORDER
        tableRow.setBackgroundColor(Color.rgb(233, 30, 99))



        val vParams = TableRow.LayoutParams(
            TableRow.LayoutParams.MATCH_PARENT,
            TableRow.LayoutParams.WRAP_CONTENT,
            1f
        )
        vParams.setMargins(0,10,0,0)

        val shp = ShapeDrawable()
        shp.shape = RectShape()
        shp.paint.color = Color.BLACK
        shp.paint.strokeWidth = 10f
        shp.paint.style = Paint.Style.STROKE


        // add values into row by calling addView()
        val versionName = TextView(this)
        versionName.layoutParams = vParams
        versionName.setText(verName.text)
        versionName.setPadding(18,8,8,8)
        versionName.setTextSize(20f)
        versionName.setTextColor(Color.parseColor("#FFFFFF"))
        versionName.setBackground(shp)

        verName.text.clear()

        val codeName = TextView(this)
        codeName.layoutParams = vParams
        codeName.setPadding(8,8,8,8)
        codeName.setTextSize(20f)
        codeName.setTextColor(Color.parseColor("#FFFFFF"))
        codeName.setBackground(shp)
        codeName.setText(cName.text)
        cName.text.clear()

        tableRow.addView(versionName)
        tableRow.addView(codeName)

        // Finally add the created row into layout
        myTbl.addView(tableRow)


        var space = Space(this)
        space.minimumHeight = 3

        myTbl.addView(space)

    }
}