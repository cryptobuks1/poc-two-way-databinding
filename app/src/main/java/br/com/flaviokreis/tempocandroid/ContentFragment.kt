package br.com.flaviokreis.tempocandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import br.com.flaviokreis.tempocandroid.databinding.FragmentContentBinding
import br.com.flaviokreis.tempocandroid.databinding.FragmentUserBinding

class ContentFragment : Fragment() {
    private val viewModel: ContentViewModel by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentContentBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_content,
            container,
            false
        )

        binding.lifecycleOwner = this

        binding.userInterface = viewModel

        return binding.root
    }
}
