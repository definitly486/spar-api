package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final StackTraceElement[] f20801lereixgezr = new StackTraceElement[0];
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private String f20802cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Exception f20803esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Class f20804iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private l8.iobyxmoadg f20805jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private l8.eablkybsjg f20806yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f20807zdlpuopuiu;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    private void agtfadlqog(Appendable appendable) {
        nufgyqmvbu(this, appendable);
        wkgbmnqykc(dxjokdxxww(), new iobyxmoadg(appendable));
    }

    private void iobyxmoadg(Throwable th2, List list) {
        if (!(th2 instanceof GlideException)) {
            list.add(th2);
            return;
        }
        Iterator it = ((GlideException) th2).dxjokdxxww().iterator();
        while (it.hasNext()) {
            iobyxmoadg((Throwable) it.next(), list);
        }
    }

    private static void lqeggnwhkg(List list, Appendable appendable) throws IOException {
        int size = list.size();
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            appendable.append("Cause (").append(String.valueOf(i14)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th2 = (Throwable) list.get(i13);
            if (th2 instanceof GlideException) {
                ((GlideException) th2).agtfadlqog(appendable);
            } else {
                nufgyqmvbu(th2, appendable);
            }
            i13 = i14;
        }
    }

    private static void nufgyqmvbu(Throwable th2, Appendable appendable) {
        try {
            appendable.append(th2.getClass().toString()).append(": ").append(th2.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th2);
        }
    }

    private static void wkgbmnqykc(List list, Appendable appendable) {
        try {
            lqeggnwhkg(list, appendable);
        } catch (IOException e13) {
            throw new RuntimeException(e13);
        }
    }

    public List btonecajqb() {
        ArrayList arrayList = new ArrayList();
        iobyxmoadg(this, arrayList);
        return arrayList;
    }

    public void draadjrbmk(String str) {
        List listBtonecajqb = btonecajqb();
        int size = listBtonecajqb.size();
        int i13 = 0;
        while (i13 < size) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Root cause (");
            int i14 = i13 + 1;
            sb3.append(i14);
            sb3.append(" of ");
            sb3.append(size);
            sb3.append(")");
            Log.i(str, sb3.toString(), (Throwable) listBtonecajqb.get(i13));
            i13 = i14;
        }
    }

    public List dxjokdxxww() {
        return this.f20807zdlpuopuiu;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb3 = new StringBuilder(71);
        sb3.append(this.f20802cqumvgiudr);
        sb3.append(this.f20804iwizpuwonk != null ? ", " + this.f20804iwizpuwonk : "");
        sb3.append(this.f20805jyumaefscl != null ? ", " + this.f20805jyumaefscl : "");
        sb3.append(this.f20806yggfygwlhe != null ? ", " + this.f20806yggfygwlhe : "");
        List<Throwable> listBtonecajqb = btonecajqb();
        if (listBtonecajqb.isEmpty()) {
            return sb3.toString();
        }
        if (listBtonecajqb.size() == 1) {
            sb3.append("\nThere was 1 root cause:");
        } else {
            sb3.append("\nThere were ");
            sb3.append(listBtonecajqb.size());
            sb3.append(" root causes:");
        }
        for (Throwable th2 : listBtonecajqb) {
            sb3.append('\n');
            sb3.append(th2.getClass().getName());
            sb3.append('(');
            sb3.append(th2.getMessage());
            sb3.append(')');
        }
        sb3.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb3.toString();
    }

    void ojitshcjhn(l8.eablkybsjg eablkybsjgVar, l8.iobyxmoadg iobyxmoadgVar) {
        rgvfuqvkyq(eablkybsjgVar, iobyxmoadgVar, null);
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    void rgvfuqvkyq(l8.eablkybsjg eablkybsjgVar, l8.iobyxmoadg iobyxmoadgVar, Class cls) {
        this.f20806yggfygwlhe = eablkybsjgVar;
        this.f20805jyumaefscl = iobyxmoadgVar;
        this.f20804iwizpuwonk = cls;
    }

    public void vdvldrhtss(Exception exc) {
        this.f20803esjtqupxsv = exc;
    }

    public GlideException(String str, Throwable th2) {
        this(str, Collections.singletonList(th2));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        agtfadlqog(printStream);
    }

    public GlideException(String str, List list) {
        this.f20802cqumvgiudr = str;
        setStackTrace(f20801lereixgezr);
        this.f20807zdlpuopuiu = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        agtfadlqog(printWriter);
    }

    private static final class iobyxmoadg implements Appendable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f20808yggfygwlhe = true;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Appendable f20809zdlpuopuiu;

        iobyxmoadg(Appendable appendable) {
            this.f20809zdlpuopuiu = appendable;
        }

        private CharSequence iobyxmoadg(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c13) throws IOException {
            if (this.f20808yggfygwlhe) {
                this.f20808yggfygwlhe = false;
                this.f20809zdlpuopuiu.append("  ");
            }
            this.f20808yggfygwlhe = c13 == '\n';
            this.f20809zdlpuopuiu.append(c13);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence charSequenceIobyxmoadg = iobyxmoadg(charSequence);
            return append(charSequenceIobyxmoadg, 0, charSequenceIobyxmoadg.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i13, int i14) throws IOException {
            CharSequence charSequenceIobyxmoadg = iobyxmoadg(charSequence);
            boolean z13 = false;
            if (this.f20808yggfygwlhe) {
                this.f20808yggfygwlhe = false;
                this.f20809zdlpuopuiu.append("  ");
            }
            if (charSequenceIobyxmoadg.length() > 0 && charSequenceIobyxmoadg.charAt(i14 - 1) == '\n') {
                z13 = true;
            }
            this.f20808yggfygwlhe = z13;
            this.f20809zdlpuopuiu.append(charSequenceIobyxmoadg, i13, i14);
            return this;
        }
    }
}
