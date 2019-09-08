package jp.dd0125.jetpacksample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import jp.dd0125.jetpacksample.R
import jp.dd0125.jetpacksample.data.DataBindingViewModel
import jp.dd0125.jetpacksample.databinding.FragmentDataBindingBinding

public class DataBindingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentDataBindingBinding>(inflater, R.layout.fragment_data_binding, container, false);
        val view = binding.root

        val viewModelFactory: ViewModelProvider.Factory = ViewModelProvider.NewInstanceFactory()
        val viewModelProvider = ViewModelProvider(this, viewModelFactory)
        val viewModel: DataBindingViewModel = viewModelProvider.get(DataBindingViewModel::class.java)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this


        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

}