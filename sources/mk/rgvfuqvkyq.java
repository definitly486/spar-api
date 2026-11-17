package mk;

import bl.wwaezpbzkn;
import hg.stevsuqkhv;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.tzroggbefp;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.istkbnxepw;
import lk.jyumaefscl;
import lk.lereixgezr;
import lk.oxmwwwfdhm;
import lk.yadqdtsiqt;
import lk.yggfygwlhe;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rgvfuqvkyq {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final boolean f67370eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final String f67371gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final TimeZone f67374wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final yggfygwlhe f67372iobyxmoadg = wflxmlrfwp.gtknphoqwx();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final istkbnxepw f67375zoijcleaow = wflxmlrfwp.draadjrbmk();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final yadqdtsiqt f67373ppxfxbqfkf = wflxmlrfwp.wflxmlrfwp();

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        zdlpuopuiu.lqeggnwhkg(timeZone);
        f67374wkgbmnqykc = timeZone;
        f67370eablkybsjg = false;
        String name = lereixgezr.class.getName();
        zdlpuopuiu.dxjokdxxww(name, "OkHttpClient::class.java.name");
        f67371gxszxtbevo = kcexrzcfyt.hszhottldk(kcexrzcfyt.lxfrhoxuzk(name, "okhttp3."), "Client");
    }

    public static final boolean agtfadlqog(wwaezpbzkn wwaezpbzknVar, int i13, TimeUnit timeUnit) {
        zdlpuopuiu.btonecajqb(wwaezpbzknVar, "<this>");
        zdlpuopuiu.btonecajqb(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jPpxfxbqfkf = wwaezpbzknVar.ppxfxbqfkf().eablkybsjg() ? wwaezpbzknVar.ppxfxbqfkf().ppxfxbqfkf() - jNanoTime : Long.MAX_VALUE;
        wwaezpbzknVar.ppxfxbqfkf().wkgbmnqykc(Math.min(jPpxfxbqfkf, timeUnit.toNanos(i13)) + jNanoTime);
        try {
            bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
            while (wwaezpbzknVar.fmlbqenlif(ppxfxbqfkfVar, 8192L) != -1) {
                ppxfxbqfkfVar.iobyxmoadg();
            }
            if (jPpxfxbqfkf == Long.MAX_VALUE) {
                wwaezpbzknVar.ppxfxbqfkf().iobyxmoadg();
            } else {
                wwaezpbzknVar.ppxfxbqfkf().wkgbmnqykc(jNanoTime + jPpxfxbqfkf);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (jPpxfxbqfkf == Long.MAX_VALUE) {
                wwaezpbzknVar.ppxfxbqfkf().iobyxmoadg();
            } else {
                wwaezpbzknVar.ppxfxbqfkf().wkgbmnqykc(jNanoTime + jPpxfxbqfkf);
            }
            return false;
        } catch (Throwable th2) {
            if (jPpxfxbqfkf == Long.MAX_VALUE) {
                wwaezpbzknVar.ppxfxbqfkf().iobyxmoadg();
            } else {
                wwaezpbzknVar.ppxfxbqfkf().wkgbmnqykc(jNanoTime + jPpxfxbqfkf);
            }
            throw th2;
        }
    }

    public static final long btonecajqb(cdpycssgdh cdpycssgdhVar) {
        zdlpuopuiu.btonecajqb(cdpycssgdhVar, "<this>");
        String strIobyxmoadg = cdpycssgdhVar.kcexrzcfyt().iobyxmoadg("Content-Length");
        if (strIobyxmoadg != null) {
            return wflxmlrfwp.cdpycssgdh(strIobyxmoadg, -1L);
        }
        return -1L;
    }

    public static final boolean draadjrbmk(Socket socket, bl.eablkybsjg source) {
        zdlpuopuiu.btonecajqb(socket, "<this>");
        zdlpuopuiu.btonecajqb(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.n();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final String dxjokdxxww(String format, Object... args) {
        zdlpuopuiu.btonecajqb(format, "format");
        zdlpuopuiu.btonecajqb(args, "args");
        tzroggbefp tzroggbefpVar = tzroggbefp.f60034iobyxmoadg;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        zdlpuopuiu.dxjokdxxww(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean eablkybsjg(jyumaefscl jyumaefsclVar, jyumaefscl other) {
        zdlpuopuiu.btonecajqb(jyumaefsclVar, "<this>");
        zdlpuopuiu.btonecajqb(other, "other");
        return zdlpuopuiu.eablkybsjg(jyumaefsclVar.dxjokdxxww(), other.dxjokdxxww()) && jyumaefsclVar.rgvfuqvkyq() == other.rgvfuqvkyq() && zdlpuopuiu.eablkybsjg(jyumaefsclVar.zdlpuopuiu(), other.zdlpuopuiu());
    }

    public static final List gtknphoqwx(Object... elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List listUnmodifiableList = Collections.unmodifiableList(hg.jyumaefscl.rgvfuqvkyq(Arrays.copyOf(objArr, objArr.length)));
        zdlpuopuiu.dxjokdxxww(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int gxszxtbevo(String name, long j13, TimeUnit timeUnit) {
        zdlpuopuiu.btonecajqb(name, "name");
        if (j13 < 0) {
            throw new IllegalStateException((name + " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j13);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((name + " too large.").toString());
        }
        if (millis != 0 || j13 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((name + " too small.").toString());
    }

    public static final String kcexrzcfyt(jyumaefscl jyumaefsclVar, boolean z13) {
        String strDxjokdxxww;
        zdlpuopuiu.btonecajqb(jyumaefsclVar, "<this>");
        if (kcexrzcfyt.sopmlzcsov(jyumaefsclVar.dxjokdxxww(), StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) {
            strDxjokdxxww = '[' + jyumaefsclVar.dxjokdxxww() + ']';
        } else {
            strDxjokdxxww = jyumaefsclVar.dxjokdxxww();
        }
        if (!z13 && jyumaefsclVar.rgvfuqvkyq() == jyumaefscl.f63067gtknphoqwx.ppxfxbqfkf(jyumaefsclVar.zdlpuopuiu())) {
            return strDxjokdxxww;
        }
        return strDxjokdxxww + ':' + jyumaefsclVar.rgvfuqvkyq();
    }

    public static final void lqeggnwhkg(Socket socket) {
        zdlpuopuiu.btonecajqb(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e13) {
            throw e13;
        } catch (RuntimeException e14) {
            if (!zdlpuopuiu.eablkybsjg(e14.getMessage(), "bio == null")) {
                throw e14;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean nufgyqmvbu(wwaezpbzkn wwaezpbzknVar, int i13, TimeUnit timeUnit) {
        zdlpuopuiu.btonecajqb(wwaezpbzknVar, "<this>");
        zdlpuopuiu.btonecajqb(timeUnit, "timeUnit");
        try {
            return agtfadlqog(wwaezpbzknVar, i13, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final ThreadFactory ojitshcjhn(final String name, final boolean z13) {
        zdlpuopuiu.btonecajqb(name, "name");
        return new ThreadFactory() { // from class: mk.ojitshcjhn
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return rgvfuqvkyq.rgvfuqvkyq(name, z13, runnable);
            }
        };
    }

    public static final yggfygwlhe oxmwwwfdhm(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        yggfygwlhe.iobyxmoadg iobyxmoadgVar = new yggfygwlhe.iobyxmoadg();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tk.zoijcleaow zoijcleaowVar = (tk.zoijcleaow) it.next();
            iobyxmoadgVar.wkgbmnqykc(zoijcleaowVar.iobyxmoadg().wypolnanlu(), zoijcleaowVar.zoijcleaow().wypolnanlu());
        }
        return iobyxmoadgVar.gxszxtbevo();
    }

    public static final oxmwwwfdhm.ppxfxbqfkf ppxfxbqfkf(final oxmwwwfdhm oxmwwwfdhmVar) {
        zdlpuopuiu.btonecajqb(oxmwwwfdhmVar, "<this>");
        return new oxmwwwfdhm.ppxfxbqfkf() { // from class: mk.agtfadlqog
            @Override // lk.oxmwwwfdhm.ppxfxbqfkf
            public final oxmwwwfdhm iobyxmoadg(lk.eablkybsjg eablkybsjgVar) {
                return rgvfuqvkyq.wkgbmnqykc(oxmwwwfdhmVar, eablkybsjgVar);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread rgvfuqvkyq(String name, boolean z13, Runnable runnable) {
        zdlpuopuiu.btonecajqb(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z13);
        return thread;
    }

    public static final List vdvldrhtss(yggfygwlhe yggfygwlheVar) {
        zdlpuopuiu.btonecajqb(yggfygwlheVar, "<this>");
        zg.btonecajqb btonecajqbVarJyumaefscl = zg.gtknphoqwx.jyumaefscl(0, yggfygwlheVar.size());
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(btonecajqbVarJyumaefscl, 10));
        Iterator it = btonecajqbVarJyumaefscl.iterator();
        while (it.hasNext()) {
            int iIobyxmoadg = ((stevsuqkhv) it).iobyxmoadg();
            arrayList.add(new tk.zoijcleaow(yggfygwlheVar.wkgbmnqykc(iIobyxmoadg), yggfygwlheVar.btonecajqb(iIobyxmoadg)));
        }
        return arrayList;
    }

    public static final Charset wflxmlrfwp(bl.eablkybsjg eablkybsjgVar, Charset charset) {
        zdlpuopuiu.btonecajqb(eablkybsjgVar, "<this>");
        zdlpuopuiu.btonecajqb(charset, "default");
        int iYggfygwlhe = eablkybsjgVar.yggfygwlhe(wflxmlrfwp.agtfadlqog());
        if (iYggfygwlhe == -1) {
            return charset;
        }
        if (iYggfygwlhe == 0) {
            return mj.wkgbmnqykc.f67326zoijcleaow;
        }
        if (iYggfygwlhe == 1) {
            return mj.wkgbmnqykc.f67325wkgbmnqykc;
        }
        if (iYggfygwlhe == 2) {
            return mj.wkgbmnqykc.f67319eablkybsjg;
        }
        if (iYggfygwlhe == 3) {
            return mj.wkgbmnqykc.f67321iobyxmoadg.iobyxmoadg();
        }
        if (iYggfygwlhe == 4) {
            return mj.wkgbmnqykc.f67321iobyxmoadg.zoijcleaow();
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oxmwwwfdhm wkgbmnqykc(oxmwwwfdhm this_asFactory, lk.eablkybsjg it) {
        zdlpuopuiu.btonecajqb(this_asFactory, "$this_asFactory");
        zdlpuopuiu.btonecajqb(it, "it");
        return this_asFactory;
    }

    public static final List yggfygwlhe(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        List listUnmodifiableList = Collections.unmodifiableList(hg.jyumaefscl.p(list));
        zdlpuopuiu.dxjokdxxww(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static /* synthetic */ String zdlpuopuiu(jyumaefscl jyumaefsclVar, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        return kcexrzcfyt(jyumaefsclVar, z13);
    }
}
