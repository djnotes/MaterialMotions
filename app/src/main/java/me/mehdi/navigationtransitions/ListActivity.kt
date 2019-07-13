package me.mehdi.navigationtransitions

import android.animation.Animator
import android.animation.Keyframe
import android.animation.PropertyValuesHolder
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.card.MaterialCardView

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
    }

//    fun goToDetail(view: View) {
//        val intent = Intent(this@ListActivity, DetailActivity::class.java);
//
//
//        val card : MaterialCardView = findViewById(R.id.card)
//
//        val k1 = Keyframe.ofFloat(0.1f, 30f)
//        val k2 = Keyframe.ofFloat(0.5f, 110f)
//        val k3 = Keyframe.ofFloat(1f, 360f)
//
////        val rotationY = PropertyValuesHolder.ofKeyframe(View.ROTATION_Y, k1, k2, k3)
//        val elevation = PropertyValuesHolder.ofFloat("elevation", card.elevation, card.rotation + 10f)
//
//
//
//        card.animate().translationZ(50f).start()
////        startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this, mountain, "mountain").toBundle());
//
//    }





    fun animateCardElevation(view: View) {
        val card : MaterialCardView = findViewById(R.id.card)

        card.animate().translationZBy(30f)
            .setListener(object: Animator.AnimatorListener {
                override fun onAnimationRepeat(animation: Animator?) {
//                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onAnimationCancel(animation: Animator?) {
//                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onAnimationStart(animation: Animator?) {
//                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onAnimationEnd(animation: Animator?) {
                    card.animate().scaleY(6f).scaleX(1.2f).start()
                    card.animate().setListener(null)
                }

            }).start()

    }
}
