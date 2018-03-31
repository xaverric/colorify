# Colorify
Simple color palette generator

## Usage
```
Colorify colorify = new Colorify();
Palette palette = colorify.getPalette();

for (Color color : palette.getColors()){
  
  //returns each color component in range 0-255
  color.getRed();
  color.getGreen();
  color.getBlue();
  
  //returns each color component in rande 0-1
  color.getRedXYZ();
  color.getGreenXYZ();
  color.getBlueXYZ();
  
  //returns color in hexadecimal format
  color.getHex();
  
  //returns color supported by java.awt library
  color.getAwtColor();
  
  //returns color supported by javafx.scene.paint library
  color.getFXColor();
}

```
## Examples
* ![Example 1](https://github.com/xaverric/colorify/blob/master/src/main/resources/examples/picture%20(1).PNG)
* ![Example 2](https://github.com/xaverric/colorify/blob/master/src/main/resources/examples/picture%20(2).PNG)
* ![Example 3](https://github.com/xaverric/colorify/blob/master/src/main/resources/examples/picture%20(3).PNG)
* ![Example 4](https://github.com/xaverric/colorify/blob/master/src/main/resources/examples/picture%20(4).PNG)
* ![Example 5](https://github.com/xaverric/colorify/blob/master/src/main/resources/examples/picture%20(5).PNG)
* ![Example 1](https://github.com/xaverric/colorify/blob/master/src/main/resources/examples/picture%20(6).PNG)


