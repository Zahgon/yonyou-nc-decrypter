package me.gv7.woodpecker.helper;

import me.gv7.woodpecker.plugin.IHelper;
import me.gv7.woodpecker.plugin.IHelperPlugin;
import me.gv7.woodpecker.plugin.IHelperPluginCallbacks;
import me.gv7.woodpecker.plugin.IPluginHelper;
import java.util.ArrayList;
import java.util.List;

public class NCPasswdDcrypter implements IHelperPlugin {

    public static IHelperPluginCallbacks callbacks;

    public static IPluginHelper pluginHelper;

    public NCPasswdDcrypter() {
    }

    @Override
    public void HelperPluginMain(IHelperPluginCallbacks iHelperPluginCallbacks) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
