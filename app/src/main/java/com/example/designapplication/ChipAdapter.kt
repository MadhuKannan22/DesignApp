package com.example.designapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup


class ChipAdapter(
    private val context: Context,
    private val subjects: List<ChipItem>,
    private val chipGroup: ChipGroup,
    private val clickListener: (ChipItem) -> Unit
) {

    init {
        addChipsToGroup()
    }

    private fun addChipsToGroup() {
        subjects.forEach { subject ->
            val chip = createChip(subject)
            chipGroup.addView(chip)
        }
    }

    private fun createChip(subject: ChipItem): Chip {
        val chip = LayoutInflater.from(context).inflate(R.layout.chip, chipGroup, false) as Chip
        chip.text = subject.text
        chip.setChipIconResource(subject.iconResId)
        chip.chipBackgroundColor = context.getColorStateList(subject.backgroundColor)
        chip.setOnClickListener {
            clickListener(subject)
        }
        return chip
    }
}
