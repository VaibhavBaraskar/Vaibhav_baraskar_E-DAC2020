function light(value){
    var pic;
    if(value==0){
        
        pic="a.jpeg";
    }else if(value==1){
        pic="E:/29092020/Lamp1.jpg";
    }else if(value==2){
        
        pic="E:/29092020/Lamp2.jpg";
    }
    else if(value==3){
        
        pic="E:/29092020/Lamp3.jpg";
    }
    else if(value==4){
        
        pic="E:/29092020/Lamp4.jpg";
    }else if(value==5){
        
        pic="E:/29092020/Lamp5.jpg";
    }
    
    document.getElementById('bulb').src=pic;
}
