
package cn.nhsoft;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import cn.trinea.android.common.util.PackageUtils;

public class RNInstallSilentModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNInstallSilentModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNInstallSilent";
  }

  @ReactMethod
  public void installSilent(String filePath) {
    PackageUtils.installSilent(this.reactContext, filePath);
  }
}