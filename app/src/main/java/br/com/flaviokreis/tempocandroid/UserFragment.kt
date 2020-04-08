package br.com.flaviokreis.tempocandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import br.com.flaviokreis.tempocandroid.databinding.FragmentUserBinding

class UserFragment : Fragment() {

    private val viewModel: UserViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentUserBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_user,
            container,
            false
        )

        binding.lifecycleOwner = this

        binding.user = viewModel.user
        binding.userInterface = viewModel
        binding.result = viewModel.result
        binding.resultLiveData = viewModel.resultLiveData

        return binding.root
    }
}
