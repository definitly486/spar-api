package jx0;

import kotlin.jvm.internal.zdlpuopuiu;
import ky0.StatusIdDto;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vdvldrhtss {
    public static final gz0.dxjokdxxww iobyxmoadg(StatusIdDto statusIdDto) {
        zdlpuopuiu.btonecajqb(statusIdDto, "<this>");
        String id2 = statusIdDto.getId();
        if (id2 == null) {
            id2 = "";
        }
        String name = statusIdDto.getName();
        return new gz0.dxjokdxxww(id2, name != null ? name : "");
    }
}
