package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    class iobyxmoadg implements gxszxtbevo.ppxfxbqfkf {
        iobyxmoadg() {
        }

        @Override // androidx.profileinstaller.gxszxtbevo.ppxfxbqfkf
        public void iobyxmoadg(int i13, Object obj) {
            gxszxtbevo.f12547zoijcleaow.iobyxmoadg(i13, obj);
            ProfileInstallReceiver.this.setResultCode(i13);
        }

        @Override // androidx.profileinstaller.gxszxtbevo.ppxfxbqfkf
        public void zoijcleaow(int i13, Object obj) {
            gxszxtbevo.f12547zoijcleaow.zoijcleaow(i13, obj);
        }
    }

    static void iobyxmoadg(int i13, gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar) {
        Process.sendSignal(i13, 10);
        ppxfxbqfkfVar.iobyxmoadg(12, null);
    }

    static void zoijcleaow(gxszxtbevo.ppxfxbqfkf ppxfxbqfkfVar) {
        iobyxmoadg(Process.myPid(), ppxfxbqfkfVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            gxszxtbevo.dxjokdxxww(context, new l5.zoijcleaow(), new iobyxmoadg(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    gxszxtbevo.btonecajqb(context, new l5.zoijcleaow(), new iobyxmoadg());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        gxszxtbevo.ppxfxbqfkf(context, new l5.zoijcleaow(), new iobyxmoadg());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            zoijcleaow(new iobyxmoadg());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.iobyxmoadg.zoijcleaow(context, iobyxmoadgVar);
        } else if ("SAVE_PROFILE".equals(string2)) {
            iobyxmoadg(extras.getInt("EXTRA_PID", Process.myPid()), iobyxmoadgVar);
        } else {
            iobyxmoadgVar.iobyxmoadg(16, null);
        }
    }
}
