package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* JADX INFO: loaded from: classes3.dex */
public class lqeggnwhkg implements ILoggerFactory {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    boolean f74197iobyxmoadg = false;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    final Map f74199zoijcleaow = new HashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    final LinkedBlockingQueue f74198ppxfxbqfkf = new LinkedBlockingQueue();

    public void eablkybsjg() {
        this.f74197iobyxmoadg = true;
    }

    @Override // org.slf4j.ILoggerFactory
    public synchronized am.iobyxmoadg iobyxmoadg(String str) {
        gxszxtbevo gxszxtbevoVar;
        gxszxtbevoVar = (gxszxtbevo) this.f74199zoijcleaow.get(str);
        if (gxszxtbevoVar == null) {
            gxszxtbevoVar = new gxszxtbevo(str, this.f74198ppxfxbqfkf, this.f74197iobyxmoadg);
            this.f74199zoijcleaow.put(str, gxszxtbevoVar);
        }
        return gxszxtbevoVar;
    }

    public LinkedBlockingQueue ppxfxbqfkf() {
        return this.f74198ppxfxbqfkf;
    }

    public List wkgbmnqykc() {
        return new ArrayList(this.f74199zoijcleaow.values());
    }

    public void zoijcleaow() {
        this.f74199zoijcleaow.clear();
        this.f74198ppxfxbqfkf.clear();
    }
}
