package jc2;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes6.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final zoijcleaow f51100iobyxmoadg = new zoijcleaow(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final ArrayList f51102zoijcleaow = new ArrayList();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static volatile ppxfxbqfkf[] f51101ppxfxbqfkf = new ppxfxbqfkf[0];

    /* JADX INFO: renamed from: jc2.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static class C1098iobyxmoadg extends ppxfxbqfkf {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public static final C1099iobyxmoadg f51103ppxfxbqfkf = new C1099iobyxmoadg(null);

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private static final Pattern f51104wkgbmnqykc = Pattern.compile("(\\$\\d+)+$");

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final List f51105zoijcleaow = jyumaefscl.rgvfuqvkyq(iobyxmoadg.class.getName(), zoijcleaow.class.getName(), ppxfxbqfkf.class.getName(), C1098iobyxmoadg.class.getName());

        /* JADX INFO: renamed from: jc2.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        public static final class C1099iobyxmoadg {
            public /* synthetic */ C1099iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
                this();
            }

            private C1099iobyxmoadg() {
            }
        }

        @Override // jc2.iobyxmoadg.ppxfxbqfkf
        public String nufgyqmvbu() {
            String strNufgyqmvbu = super.nufgyqmvbu();
            if (strNufgyqmvbu != null) {
                return strNufgyqmvbu;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            zdlpuopuiu.dxjokdxxww(stackTrace, "Throwable().stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (!this.f51105zoijcleaow.contains(stackTraceElement.getClassName())) {
                    return ojitshcjhn(stackTraceElement);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        protected String ojitshcjhn(StackTraceElement element) {
            zdlpuopuiu.btonecajqb(element, "element");
            String className = element.getClassName();
            zdlpuopuiu.dxjokdxxww(className, "element.className");
            String strF = kcexrzcfyt.f(className, '.', null, 2, null);
            Matcher matcher = f51104wkgbmnqykc.matcher(strF);
            if (matcher.find()) {
                strF = matcher.replaceAll("");
                zdlpuopuiu.dxjokdxxww(strF, "m.replaceAll(\"\")");
            }
            strF.length();
            return strF;
        }

        @Override // jc2.iobyxmoadg.ppxfxbqfkf
        protected void wflxmlrfwp(int i13, String str, String message, Throwable th2) {
            int iMin;
            zdlpuopuiu.btonecajqb(message, "message");
            if (message.length() < 4000) {
                if (i13 == 7) {
                    Log.wtf(str, message);
                    return;
                } else {
                    Log.println(i13, str, message);
                    return;
                }
            }
            int length = message.length();
            int i14 = 0;
            while (i14 < length) {
                int iYfnezrywwk = kcexrzcfyt.yfnezrywwk(message, '\n', i14, false, 4, null);
                if (iYfnezrywwk == -1) {
                    iYfnezrywwk = length;
                }
                while (true) {
                    iMin = Math.min(iYfnezrywwk, i14 + 4000);
                    String strSubstring = message.substring(i14, iMin);
                    zdlpuopuiu.dxjokdxxww(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i13 == 7) {
                        Log.wtf(str, strSubstring);
                    } else {
                        Log.println(i13, str, strSubstring);
                    }
                    if (iMin >= iYfnezrywwk) {
                        break;
                    } else {
                        i14 = iMin;
                    }
                }
                i14 = iMin + 1;
            }
        }
    }

    public static abstract class ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ThreadLocal f51106iobyxmoadg = new ThreadLocal();

        private final void agtfadlqog(int i13, Throwable th2, String str, Object... objArr) {
            String strNufgyqmvbu = nufgyqmvbu();
            if (draadjrbmk(strNufgyqmvbu, i13)) {
                if (str != null && str.length() != 0) {
                    if (!(objArr.length == 0)) {
                        str = eablkybsjg(str, objArr);
                    }
                    if (th2 != null) {
                        str = ((Object) str) + '\n' + lqeggnwhkg(th2);
                    }
                } else if (th2 == null) {
                    return;
                } else {
                    str = lqeggnwhkg(th2);
                }
                wflxmlrfwp(i13, strNufgyqmvbu, str, th2);
            }
        }

        private final String lqeggnwhkg(Throwable th2) {
            StringWriter stringWriter = new StringWriter(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String string = stringWriter.toString();
            zdlpuopuiu.dxjokdxxww(string, "sw.toString()");
            return string;
        }

        public void btonecajqb(Throwable th2) {
            agtfadlqog(4, th2, null, new Object[0]);
        }

        protected boolean draadjrbmk(String str, int i13) {
            return gtknphoqwx(i13);
        }

        public void dxjokdxxww(String str, Object... args) {
            zdlpuopuiu.btonecajqb(args, "args");
            agtfadlqog(4, null, str, Arrays.copyOf(args, args.length));
        }

        protected String eablkybsjg(String message, Object[] args) {
            zdlpuopuiu.btonecajqb(message, "message");
            zdlpuopuiu.btonecajqb(args, "args");
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            zdlpuopuiu.dxjokdxxww(str, "java.lang.String.format(this, *args)");
            return str;
        }

        protected boolean gtknphoqwx(int i13) {
            return true;
        }

        public final /* synthetic */ ThreadLocal gxszxtbevo() {
            return this.f51106iobyxmoadg;
        }

        public void iobyxmoadg(String str, Object... args) {
            zdlpuopuiu.btonecajqb(args, "args");
            agtfadlqog(3, null, str, Arrays.copyOf(args, args.length));
        }

        public /* synthetic */ String nufgyqmvbu() {
            String str = (String) this.f51106iobyxmoadg.get();
            if (str != null) {
                this.f51106iobyxmoadg.remove();
            }
            return str;
        }

        public void ppxfxbqfkf(Throwable th2) {
            agtfadlqog(6, th2, null, new Object[0]);
        }

        protected abstract void wflxmlrfwp(int i13, String str, String str2, Throwable th2);

        public void wkgbmnqykc(Throwable th2, String str, Object... args) {
            zdlpuopuiu.btonecajqb(args, "args");
            agtfadlqog(6, th2, str, Arrays.copyOf(args, args.length));
        }

        public void zoijcleaow(String str, Object... args) {
            zdlpuopuiu.btonecajqb(args, "args");
            agtfadlqog(6, null, str, Arrays.copyOf(args, args.length));
        }
    }

    public static final class zoijcleaow extends ppxfxbqfkf {
        public /* synthetic */ zoijcleaow(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        @Override // jc2.iobyxmoadg.ppxfxbqfkf
        public void btonecajqb(Throwable th2) {
            for (ppxfxbqfkf ppxfxbqfkfVar : iobyxmoadg.f51101ppxfxbqfkf) {
                ppxfxbqfkfVar.btonecajqb(th2);
            }
        }

        @Override // jc2.iobyxmoadg.ppxfxbqfkf
        public void dxjokdxxww(String str, Object... args) {
            zdlpuopuiu.btonecajqb(args, "args");
            for (ppxfxbqfkf ppxfxbqfkfVar : iobyxmoadg.f51101ppxfxbqfkf) {
                ppxfxbqfkfVar.dxjokdxxww(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // jc2.iobyxmoadg.ppxfxbqfkf
        public void iobyxmoadg(String str, Object... args) {
            zdlpuopuiu.btonecajqb(args, "args");
            for (ppxfxbqfkf ppxfxbqfkfVar : iobyxmoadg.f51101ppxfxbqfkf) {
                ppxfxbqfkfVar.iobyxmoadg(str, Arrays.copyOf(args, args.length));
            }
        }

        public final void ojitshcjhn(ppxfxbqfkf tree) {
            zdlpuopuiu.btonecajqb(tree, "tree");
            if (!(tree != this)) {
                throw new IllegalArgumentException("Cannot plant Timber into itself.");
            }
            synchronized (iobyxmoadg.f51102zoijcleaow) {
                iobyxmoadg.f51102zoijcleaow.add(tree);
                Object[] array = iobyxmoadg.f51102zoijcleaow.toArray(new ppxfxbqfkf[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                iobyxmoadg.f51101ppxfxbqfkf = (ppxfxbqfkf[]) array;
                wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        @Override // jc2.iobyxmoadg.ppxfxbqfkf
        public void ppxfxbqfkf(Throwable th2) {
            for (ppxfxbqfkf ppxfxbqfkfVar : iobyxmoadg.f51101ppxfxbqfkf) {
                ppxfxbqfkfVar.ppxfxbqfkf(th2);
            }
        }

        public final ppxfxbqfkf rgvfuqvkyq(String tag) {
            zdlpuopuiu.btonecajqb(tag, "tag");
            ppxfxbqfkf[] ppxfxbqfkfVarArr = iobyxmoadg.f51101ppxfxbqfkf;
            int length = ppxfxbqfkfVarArr.length;
            int i13 = 0;
            while (i13 < length) {
                ppxfxbqfkf ppxfxbqfkfVar = ppxfxbqfkfVarArr[i13];
                i13++;
                ppxfxbqfkfVar.gxszxtbevo().set(tag);
            }
            return this;
        }

        @Override // jc2.iobyxmoadg.ppxfxbqfkf
        protected void wflxmlrfwp(int i13, String str, String message, Throwable th2) {
            zdlpuopuiu.btonecajqb(message, "message");
            throw new AssertionError();
        }

        @Override // jc2.iobyxmoadg.ppxfxbqfkf
        public void wkgbmnqykc(Throwable th2, String str, Object... args) {
            zdlpuopuiu.btonecajqb(args, "args");
            for (ppxfxbqfkf ppxfxbqfkfVar : iobyxmoadg.f51101ppxfxbqfkf) {
                ppxfxbqfkfVar.wkgbmnqykc(th2, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // jc2.iobyxmoadg.ppxfxbqfkf
        public void zoijcleaow(String str, Object... args) {
            zdlpuopuiu.btonecajqb(args, "args");
            for (ppxfxbqfkf ppxfxbqfkfVar : iobyxmoadg.f51101ppxfxbqfkf) {
                ppxfxbqfkfVar.zoijcleaow(str, Arrays.copyOf(args, args.length));
            }
        }

        private zoijcleaow() {
        }
    }
}
