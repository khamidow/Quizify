package uz.mobiler.gita.quizapplaunch

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.DialogFragment

class BorderlessDialog(private val dialogResultListener: DialogResultListener) : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate your custom layout here
        return inflater.inflate(R.layout.dialog_user_name, container, false)
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(
            355.dpToPx(this), // Optional: make it full width
            271.dpToPx(this)  // Optional: wrap content height
        )
        // **Crucial step**: Make the dialog background transparent to remove borders/margins
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        isCancelable = false
        val sharedPreferences = requireContext().getSharedPreferences("MyData", Context.MODE_PRIVATE)
        val ed: EditText = view.findViewById(R.id.name_ed)
        val okayBtn: AppCompatButton = view.findViewById(R.id.ok_btn)

        ed.setTextColor(Color.parseColor("#462B20"))
        ed.setHintTextColor(Color.parseColor("#462B20"))
        okayBtn.setOnClickListener {
            if (ed.text.toString().isEmpty()) {
                Toast.makeText(requireContext(), "Enter your name, please!", Toast.LENGTH_SHORT).show()
            } else {
                sharedPreferences.edit().putString("userName", ed.text.toString()).apply()
                dialogResultListener.onResult(ed.text.toString())
                dismiss()
            }
        }
    }

    // Optional: Hide the title feature if it's present by default
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val dialog = super.onCreateDialog(savedInstanceState)
        dialog.window?.requestFeature(Window.FEATURE_NO_TITLE)
        return dialog
    }

    fun Number.dpToPx(context: BorderlessDialog): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, // Use COMPLEX_UNIT_DIP for dp
            this.toFloat(),
            context.resources.displayMetrics
        ).toInt()
    }
}
interface DialogResultListener {
    fun onResult(result: String)
}