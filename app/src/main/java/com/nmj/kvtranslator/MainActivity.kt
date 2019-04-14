package com.nmj.kvtranslator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 작업 순서
 *  1. layout 구성
 *  2.
 *
 *
 * kotlin 정리
 *  - 파일 확장자가 kt 이네
 *  - 코드에서 리소스 객체를 사용할때 findViewById를 사용할 필요가 없이, 그냥 my_id.callMethod 처럼 호출한다.
 *

 val : 자바 final 같은 거
 var : 일반적인 변수

 layout 스터디
https://academy.realm.io/kr/posts/exploring-new-android-layouts/
https://academy.realm.io/kr/posts/constraintlayout-it-can-do-what-now/

    - ConstraintLayout
    - FlexboxLayout




app:layout_constraintRight_toRightOf="parent"
app:layout_constraintLeft_toLeftOf="parent"
app:layout_constraintBottom_toBottomOf="parent"
app:layout_constraintTop_toTopOf="parent"
해당 면을 목표의 면과 동일한 위치에 있도록 한다.

app:layout_constraintHorizontal_bias="0.2"  // 0.2퍼센트 비유로 좌측에 위치해러

가이드 라인
<android.support.constraint.Guideline
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:id="@+id/guideline"
app:layout_constraintGuide_begin="20dp"
android:orientation="vertical" />


 * start, end 속성은 left, right 속성보다 우선됨
 * constraint는 위치, 크기 기준을 잡아줌
 * match_parent 사용하지 말라고 함
 * View 너비를 최대로 하려며 match_parent 를 쓰면 되는데, 0dp 랑 같음. match_constraint 라고 읽는다는데??

 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, TransActivity::class.java))
        finish()
    }
}
