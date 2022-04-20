package com.example.moviesqllite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.moviesqllite.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(inflater,container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
            BtnClasificacion.setOnClickListener {
                findNavController().navigate(R.id.irAClasificacion)
            }

            BtnIdioma.setOnClickListener {
                findNavController().navigate(R.id.irAIdioma)
            }
            BtnGenero.setOnClickListener {
                findNavController().navigate(R.id.irAGenero)
            }
            BtnNacionalidad.setOnClickListener {
                findNavController().navigate(R.id.irANacionalidad)
            }
            BtnPelicula.setOnClickListener {
                findNavController().navigate(R.id.irAPelicula)
            }

        }
    }

}