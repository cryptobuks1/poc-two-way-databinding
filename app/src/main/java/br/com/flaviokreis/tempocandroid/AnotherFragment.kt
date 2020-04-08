package br.com.flaviokreis.tempocandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import br.com.flaviokreis.tempocandroid.databinding.FragmentAnotherBinding
import br.com.flaviokreis.tempocandroid.databinding.FragmentContentBinding
import br.com.flaviokreis.tempocandroid.databinding.FragmentUserBinding

class AnotherFragment : Fragment() {
    private val viewModel: AnotherViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentAnotherBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_another,
            container,
            false
        )

        binding.lifecycleOwner = this

        binding.userInterface = viewModel

        return binding.root
    }
}
