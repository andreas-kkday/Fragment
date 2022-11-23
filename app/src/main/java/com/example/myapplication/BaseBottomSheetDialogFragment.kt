package com.example.myapplication

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class DemoBottomSheetDialog(): BaseBottomSheetDialogFragment(R.layout.item_bottom_sheet_dialog)

abstract class BaseBottomSheetDialogFragment(
    @LayoutRes private val _layoutResourceId: Int? = null,
    private val _shouldCanceledOnTouchOutside: Boolean? = null
): BottomSheetDialogFragment() {

    private val layoutResourceId = R.layout.item_bottom_sheet_dialog


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return super.onCreateDialog(savedInstanceState)
            .apply {
                setOnShowListener {

                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? = inflater.inflate(layoutResourceId, container, false).apply {
    }

    override fun dismissAllowingStateLoss() {
        if (isAdded) super.dismissAllowingStateLoss()
    }

    companion object {
        const val ARG_LAYOUT_RESID = "ARG_LAYOUT_RESID"
        const val ARG_CANCEL_TOUCH_OUTSIDE = "ARG_CANCEL_TOUCH_OUTSIDE"
    }
}