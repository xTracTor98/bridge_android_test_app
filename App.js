import React from 'react';
import {View, StyleSheet} from 'react-native';
import WheelPickerAndroid from './WheelPickerAndroid';
import MyWebView from './MyWebView';

const App = () => {
  return (
    <View style={styles.container}>
      <MyWebView style={styles.myWebView} />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    width: '100%',
  },
  myWebView: {
    width: '100%',
    height: '100%',
  },
});

export default App;
