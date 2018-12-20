
# react-native-install-silent

## Getting started

`$ npm install react-native-install-silent --save`

### Mostly automatic installation

`$ react-native link react-native-install-silent`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import cn.nhsoft.RNInstallSilentPackage;` to the imports at the top of the file
  - Add `new RNInstallSilentPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-install-silent'
  	project(':react-native-install-silent').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-install-silent/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-install-silent')
  	```


## Usage
```javascript
import RNInstallSilent from 'react-native-install-silent';

// TODO: What to do with the module?
RNInstallSilent;
```
  