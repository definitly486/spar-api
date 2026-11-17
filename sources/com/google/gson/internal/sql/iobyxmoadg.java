package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.vdvldrhtss;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final vdvldrhtss f25165eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final vdvldrhtss f25166gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final boolean f25167iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.zoijcleaow f25168ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final vdvldrhtss f25169wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.zoijcleaow f25170zoijcleaow;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C0424iobyxmoadg extends DefaultDateTypeAdapter.zoijcleaow {
        C0424iobyxmoadg(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.zoijcleaow
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public Date wkgbmnqykc(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    class zoijcleaow extends DefaultDateTypeAdapter.zoijcleaow {
        zoijcleaow(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.zoijcleaow
        /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
        public Timestamp wkgbmnqykc(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z13;
        try {
            Class.forName("java.sql.Date");
            z13 = true;
        } catch (ClassNotFoundException unused) {
            z13 = false;
        }
        f25167iobyxmoadg = z13;
        if (z13) {
            f25170zoijcleaow = new C0424iobyxmoadg(Date.class);
            f25168ppxfxbqfkf = new zoijcleaow(Timestamp.class);
            f25169wkgbmnqykc = SqlDateTypeAdapter.f25159zoijcleaow;
            f25165eablkybsjg = SqlTimeTypeAdapter.f25161zoijcleaow;
            f25166gxszxtbevo = SqlTimestampTypeAdapter.f25163zoijcleaow;
            return;
        }
        f25170zoijcleaow = null;
        f25168ppxfxbqfkf = null;
        f25169wkgbmnqykc = null;
        f25165eablkybsjg = null;
        f25166gxszxtbevo = null;
    }
}
