package com.example.myarchitechture.view.uicontroller

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormSiswa(
    // edit 1 : parameter pilihanJK dan onSubmitButtonClicked

    pilihanJK: List<String>,
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
    modifier: Modifier = Modifier
) {

    // edit 2 : tambahkan 4 variabel di bawah ini
    var txtNama by rememberSaveable { mutableStateOf(value = "") }
    var txtAlamat by remember { mutableStateOf(value = "") }
    var txtGender by remember { mutableStateOf(value = "") }
    val listData: MutableList<String> = mutableListOf(txtNama, txtGender, txtAlamat)

    Scaffold(modifier = modifier) {
        // isi form nanti di sini
    }
}
