package com.example.testbottomnav1234.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testbottomnav1234.R
import com.example.testbottomnav1234.databinding.FragmentSettingsBinding
import android.widget.CompoundButton
import android.widget.Toast


class SettingsFragment : Fragment() {

    private lateinit var settingsViewModel: SettingsViewModel
    private var _binding: FragmentSettingsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        settingsViewModel =
            ViewModelProvider(this).get(SettingsViewModel::class.java)

        _binding = FragmentSettingsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //val textView: TextView = binding.textSettings
        /*settingsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/



        binding.switch1.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val toast = Toast.makeText(this.context, "Темная тема включена", Toast.LENGTH_SHORT).show()
            }
            else {
                val toast = Toast.makeText(this.context, "Темная тема выключена", Toast.LENGTH_SHORT).show()
            }
        })

        binding.switch2.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val toast = Toast.makeText(this.context, "Оповещения включены", Toast.LENGTH_SHORT).show()
            }
            else {
                val toast = Toast.makeText(this.context, "Оповещения выключены", Toast.LENGTH_SHORT).show()
            }
        })

        binding.switch3.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                val toast = Toast.makeText(this.context, "Функция сохранения включена", Toast.LENGTH_SHORT).show()
            }
            else {
                val toast = Toast.makeText(this.context, "Функция сохранения выключена", Toast.LENGTH_SHORT).show()
            }
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}