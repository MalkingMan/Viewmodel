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

    Scaffold(
        modifier = Modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.data_siswa),
                        color = Color.White
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500)
                )
            )
        }
}