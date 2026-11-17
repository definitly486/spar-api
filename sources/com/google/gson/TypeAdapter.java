package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeAdapter {
    public final TypeAdapter iobyxmoadg() {
        return new TypeAdapter() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Object obj) throws IOException {
                if (obj == null) {
                    ppxfxbqfkfVar.jyumaefscl();
                } else {
                    TypeAdapter.this.wkgbmnqykc(ppxfxbqfkfVar, obj);
                }
            }

            @Override // com.google.gson.TypeAdapter
            public Object zoijcleaow(ce.iobyxmoadg iobyxmoadgVar) throws IOException {
                if (iobyxmoadgVar.kegysxyocb() != ce.zoijcleaow.NULL) {
                    return TypeAdapter.this.zoijcleaow(iobyxmoadgVar);
                }
                iobyxmoadgVar.wwaezpbzkn();
                return null;
            }
        };
    }

    public final nufgyqmvbu ppxfxbqfkf(Object obj) {
        try {
            com.google.gson.internal.bind.iobyxmoadg iobyxmoadgVar = new com.google.gson.internal.bind.iobyxmoadg();
            wkgbmnqykc(iobyxmoadgVar, obj);
            return iobyxmoadgVar.okpsazkaxt();
        } catch (IOException e13) {
            throw new JsonIOException(e13);
        }
    }

    public abstract void wkgbmnqykc(ce.ppxfxbqfkf ppxfxbqfkfVar, Object obj);

    public abstract Object zoijcleaow(ce.iobyxmoadg iobyxmoadgVar);
}
