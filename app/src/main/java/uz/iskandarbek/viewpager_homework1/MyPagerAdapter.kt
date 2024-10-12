package uz.iskandarbek.viewpager_homework1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class MyPagerAdapter : PagerAdapter() {
    override fun getCount(): Int = 4

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemPager =
            LayoutInflater.from(container.context).inflate(R.layout.item_page, container, false)

        val itemBAckround = itemPager.findViewById<LinearLayout>(R.id.viewBackround)
        val tvTitle = itemPager.findViewById<TextView>(R.id.tv_title)
        val tvMessage = itemPager.findViewById<TextView>(R.id.tv_message)


        when (position) {
            1-> {
                itemBAckround.setBackgroundResource(R.drawable.itp2)
                tvTitle.text = "Hikoyalar dunyosi"
                tvMessage.text = "Gar zamonni nayf qilsam ayb qilma, ey rafiq, " +
                        "Ko‘rmadim hargiz, netoyin, bu zamondin yaxshilig‘ ! "

            }
            2->{
                itemBAckround.setBackgroundResource(R.drawable.itp3)
                tvTitle.text = "Kitob ortidan..."
                tvMessage.text = "Dilrabolardin yomonliq keldi mahzun ko‘ngluma,  Kelmadi jonimga hech oromi jondin yaxshilig"
            }
            3->{
                itemBAckround.setBackgroundResource(R.drawable.itp4)
                tvTitle.text = "Bizga qo'shiling"
                tvMessage.text = "Ey ko‘ngul, chun yaxshidin ko‘rdung yamonliq asru ko‘p," +
                        " Emdi ko‘z tutmoq ne ma’ni har yamondin yaxshilig'?"
            }

        }
        container.addView(itemPager)
        return itemPager
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val view = `object` as View
        container.removeView(view)

    }
}