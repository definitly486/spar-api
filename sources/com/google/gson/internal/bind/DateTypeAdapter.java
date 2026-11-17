package com.google.gson.internal.bind;

import ce.ppxfxbqfkf;
import ce.zoijcleaow;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.dxjokdxxww;
import com.google.gson.internal.wkgbmnqykc;
import com.google.gson.vdvldrhtss;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class DateTypeAdapter extends TypeAdapter {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final vdvldrhtss f24972zoijcleaow = new vdvldrhtss() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.vdvldrhtss
        public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar.ppxfxbqfkf() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final List f24973iobyxmoadg;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f24973iobyxmoadg = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (wkgbmnqykc.wkgbmnqykc()) {
            arrayList.add(dxjokdxxww.ppxfxbqfkf(2, 2));
        }
    }

    private Date eablkybsjg(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
        String strDsvhmnatus = iobyxmoadgVar.dsvhmnatus();
        synchronized (this.f24973iobyxmoadg) {
            try {
                Iterator it = this.f24973iobyxmoadg.iterator();
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
        if (iobyxmoadgVar.kegysxyocb() != zoijcleaow.NULL) {
            return eablkybsjg(iobyxmoadgVar);
        }
        iobyxmoadgVar.wwaezpbzkn();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Date date) throws IOException {
        String str;
        if (date == null) {
            ppxfxbqfkfVar.jyumaefscl();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f24973iobyxmoadg.get(0);
        synchronized (this.f24973iobyxmoadg) {
            str = dateFormat.format(date);
        }
        ppxfxbqfkfVar.ulzqkzuiru(str);
    }
}
