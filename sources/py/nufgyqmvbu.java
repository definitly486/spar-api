package py;

import gz.ReferenceGroupDto;
import hg.jyumaefscl;
import iy.CommentReferencesEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;
import kz.CommentReferencesDto;
import kz.OrderCommentsDto;
import oy.draadjrbmk;
import ru.myspar.core.domain.models.cart.CommentReferences;
import ru.myspar.core.domain.models.reference.Reference;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nufgyqmvbu {
    public static final List iobyxmoadg(OrderCommentsDto orderCommentsDto) {
        List groups;
        if (orderCommentsDto == null || (groups = orderCommentsDto.getGroups()) == null) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(groups, 10));
        Iterator it = groups.iterator();
        while (it.hasNext()) {
            arrayList.add(lqeggnwhkg.zoijcleaow((CommentReferencesDto) it.next()));
        }
        return arrayList;
    }

    public static final List ppxfxbqfkf(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(lqeggnwhkg.ppxfxbqfkf((CommentReferences) it.next()));
        }
        return arrayList;
    }

    public static final List wkgbmnqykc(List list) {
        zdlpuopuiu.btonecajqb(list, "<this>");
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CommentReferences commentReferences = (CommentReferences) it.next();
            String code = commentReferences.getCode();
            List items = commentReferences.getItems();
            ArrayList arrayList2 = new ArrayList(jyumaefscl.cqumvgiudr(items, 10));
            Iterator it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList2.add(draadjrbmk.ppxfxbqfkf((Reference) it2.next()));
            }
            arrayList.add(new ReferenceGroupDto(code, arrayList2));
        }
        return arrayList;
    }

    public static final List zoijcleaow(List list) {
        if (list == null) {
            return jyumaefscl.wflxmlrfwp();
        }
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(lqeggnwhkg.iobyxmoadg((CommentReferencesEntity) it.next()));
        }
        return arrayList;
    }
}
