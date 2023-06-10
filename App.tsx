/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 */
import React from 'react';
import {
  SafeAreaView,
  StyleSheet,
  Text,
  TouchableOpacity,
  View,
  NativeModules,
} from 'react-native';

const KotlinDemo = NativeModules.LogModule;
function App(): JSX.Element {
  return (
    <SafeAreaView style={styles.container}>
      <TouchableOpacity onPress={() => KotlinDemo.showToast('Hello World to Log')}>
        <View style ={styles.btn}>
          <Text>Click to show Toast and log</Text>
        </View>
      </TouchableOpacity>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex:1,
    justifyContent: 'center',
    alignItems: 'center',
  },
  btn: {
    padding:10,
    backgroundColor: 'grey',
  }
});

export default App;
