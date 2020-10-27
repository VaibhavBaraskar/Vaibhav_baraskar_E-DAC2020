btnSection = document.getElementById('btn-section').children

console.log(btnSection)
for(let i=1; i<btnSection.length; i++){
    btnSection[i].disabled = true;
}

function lightUp(value){
    let pic = ""
    if(value == 1){
        pic = "./images/Lamp1.png"
        btnSection[1].disabled = false;
    }
    else if(value == 2){
        pic = "./images/Lamp2.png"
        btnSection[2].disabled = false;
    }
    else if(value == 3){
        pic = "./images/Lamp3.png"
        btnSection[3].disabled = false;
    }
    else if(value == 4){
        pic = "./images/Lamp4.png"
        btnSection[4].disabled = false;
    }
    else if(value == 5){
        pic = "./images/Lamp5.png"
    }
    document.getElementById('lamp').setAttribute('src', pic)
    console.log(document.getElementById('lamp'))
}