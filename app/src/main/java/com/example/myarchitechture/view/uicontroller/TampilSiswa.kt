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

    ) { isiRuang ->

        Column(
            modifier = Modifier
                .padding(isiRuang)
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            Column(
                modifier = Modifier.padding(all = dimensionResource(id = R.dimen._16dp)),
                verticalArrangement = Arrangement.spacedBy(space = dimensionResource(id = R.dimen._10dp))
            ) {
                items.forEach { item ->
                    Column {
                        Text(
                            text = item.first.uppercase(),
                            fontSize = 16.sp
                        )
                        Text(
                            text = item.second,
                            fontWeight = FontWeight.Bold,
                            fontSize = 16.sp
                        )
                    }

                    Divider(thickness = dimensionResource(id = R.dimen._1dp))
                }
            }
            Spacer(
                modifier = Modifier.height(height = dimensionResource(id = R.dimen._10dp))
            )

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onBackButtonClicked
            ) {
                Text(text = stringResource(id = R.string.back))
            }
        }
    }
}

