package com.example.myarchitechture.view.uicontroller

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    // edit 1 : parameter statusUiSiswa
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit
) {

    // edit 2 : items Pair
    val items = listOf(
        Pair(first = stringResource(id = R.string.nama_lengkap), second = statusUiSiswa.nama),
        Pair(first = stringResource(id = R.string.jenis_kelamin), second = statusUiSiswa.gender),
        Pair(first = stringResource(id = R.string.alamat), second = statusUiSiswa.alamat)
    )
}