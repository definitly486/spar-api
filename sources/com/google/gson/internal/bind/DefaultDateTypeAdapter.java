package com.google.gson.internal.bind;

import ce.ppxfxbqfkf;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.dxjokdxxww;
import com.google.gson.internal.wkgbmnqykc;
import com.google.gson.vdvldrhtss;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zoijcleaow f24974iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final List f24975zoijcleaow;

    public static abstract class zoijcleaow {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final zoijcleaow f24976zoijcleaow = new iobyxmoadg(Date.class);

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final Class f24977iobyxmoadg;

        class iobyxmoadg extends zoijcleaow {
            iobyxmoadg(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.zoijcleaow
            protected Date wkgbmnqykc(Date date) {
                return date;
            }
        }

        protected zoijcleaow(Class cls) {
            this.f24977iobyxmoadg = cls;
        }

        private vdvldrhtss ppxfxbqfkf(DefaultDateTypeAdapter defaultDateTypeAdapter) {
            return TypeAdapters.zoijcleaow(this.f24977iobyxmoadg, defaultDateTypeAdapter);
        }

        public final vdvldrhtss iobyxmoadg(int i13, int i14) {
            return ppxfxbqfkf(new DefaultDateTypeAdapter(this, i13, i14));
        }

        protected abstract Date wkgbmnqykc(Date date);

        public final vdvldrhtss zoijcleaow(String str) {
            return ppxfxbqfkf(new DefaultDateTypeAdapter(this, str));
        }
    }

    private Date eablkybsjg(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
        String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
        synchronized (this.f24975zoijcleaow) {
            try {
                Iterator it = this.f24975zoijcleaow.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strDsvhmnatus);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return zd.iobyxmoadg.ppxfxbqfkf(strDsvhmnatus, new ParsePosition(0));
                } catch (ParseException e13) {
                    throw new JsonSyntaxException("Failed parsing '" + strDsvhmnatus + "' as Date; at path " + iobyxmoadgVar.rgvfuqvkyq(), e13);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Date zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
        if (iobyxmoadgVar.kegysxyocb() == ce.zoijcleaow.NULL) {
            iobyxmoadgVar.wwaezpbzkn();
            return null;
        }
        return this.f24974iobyxmoadg.wkgbmnqykc(eablkybsjg(iobyxmoadgVar));
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Date date) throws IOException {
        String str;
        if (date == null) {
            ppxfxbqfkfVar.jyumaefscl();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f24975zoijcleaow.get(0);
        synchronized (this.f24975zoijcleaow) {
            str = dateFormat.format(date);
        }
        ppxfxbqfkfVar.ulzqkzuiru(str);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f24975zoijcleaow.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    private DefaultDateTypeAdapter(zoijcleaow zoijcleaowVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.f24975zoijcleaow = arrayList;
        Objects.requireNonNull(zoijcleaowVar);
        this.f24974iobyxmoadg = zoijcleaowVar;
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    private DefaultDateTypeAdapter(zoijcleaow zoijcleaowVar, int i13, int i14) {
        ArrayList arrayList = new ArrayList();
        this.f24975zoijcleaow = arrayList;
        Objects.requireNonNull(zoijcleaowVar);
        this.f24974iobyxmoadg = zoijcleaowVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i13, i14, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i13, i14));
        }
        if (wkgbmnqykc.wkgbmnqykc()) {
            arrayList.add(dxjokdxxww.ppxfxbqfkf(i13, i14));
        }
    }
}
