import {View, requireNativeComponent} from 'react-native';

const settings = {
  name: 'MyWebView',
  propTypes: {
    ...View.propTypes,
  },
};

export default requireNativeComponent('MyWebView', settings);
