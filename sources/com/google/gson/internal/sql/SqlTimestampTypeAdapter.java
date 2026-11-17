package com.google.gson.internal.sql;

import ce.ppxfxbqfkf;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.vdvldrhtss;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
class SqlTimestampTypeAdapter extends TypeAdapter {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    static final vdvldrhtss f25163zoijcleaow = new vdvldrhtss() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.vdvldrhtss
        public TypeAdapter iobyxmoadg(Gson gson, be.iobyxmoadg iobyxmoadgVar) {
            if (iobyxmoadgVar.ppxfxbqfkf() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.agtfadlqog(Date.class));
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TypeAdapter f25164iobyxmoadg;

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public Timestamp zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) {
        Date date = (Date) this.f25164iobyxmoadg.zoijcleaow(iobyxmoadgVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public void wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar, Timestamp timestamp) {
        this.f25164iobyxmoadg.wkgbmnqykc(ppxfxbqfkfVar, timestamp);
    }

    private SqlTimestampTypeAdapter(TypeAdapter typeAdapter) {
        this.f25164iobyxmoadg = typeAdapter;
    }
}
