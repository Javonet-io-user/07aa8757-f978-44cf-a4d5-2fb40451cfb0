package jio.System.Data.SQLite;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import jio.System.Data.SQLite.*;
import jio.System.*;
import jio.System.Collections.*;

public class SQLiteModuleEnumerable extends SQLiteModuleCommon
    implements ISQLiteManagedModule, IDisposable {
  protected NObject javonetHandle;

  public SQLiteModuleEnumerable(java.lang.String name, IEnumerable enumerable) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("System.Data.SQLite.SQLiteModuleEnumerable", name, enumerable);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteModuleEnumerable(
      java.lang.String name, IEnumerable enumerable, java.lang.Boolean objectIdentity) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "System.Data.SQLite.SQLiteModuleEnumerable", name, enumerable, objectIdentity);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SQLiteModuleEnumerable(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Create(
      SQLiteConnection connection,
      IntPtr pClientData,
      java.lang.String[] arguments,
      SQLiteVirtualTable table,
      AtomicReference<java.lang.String> error) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke(
                  "Create",
                  connection,
                  pClientData,
                  new Object[] {arguments},
                  table,
                  new NRef(error));
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Connect(
      SQLiteConnection connection,
      IntPtr pClientData,
      java.lang.String[] arguments,
      SQLiteVirtualTable table,
      AtomicReference<java.lang.String> error) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke(
                  "Connect",
                  connection,
                  pClientData,
                  new Object[] {arguments},
                  table,
                  new NRef(error));
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode BestIndex(SQLiteVirtualTable table, SQLiteIndex index) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("BestIndex", table, index);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Disconnect(SQLiteVirtualTable table) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Disconnect", table);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Destroy(SQLiteVirtualTable table) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Destroy", table);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Open(SQLiteVirtualTable table, SQLiteVirtualTableCursor cursor) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Open", table, cursor);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Close(SQLiteVirtualTableCursor cursor) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Close", cursor);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Filter(
      SQLiteVirtualTableCursor cursor,
      java.lang.Integer indexNumber,
      java.lang.String indexString,
      SQLiteValue[] values) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Filter", cursor, indexNumber, indexString, new Object[] {values});
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Next(SQLiteVirtualTableCursor cursor) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Next", cursor);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Eof(SQLiteVirtualTableCursor cursor) {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Eof", cursor);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Column(
      SQLiteVirtualTableCursor cursor, SQLiteContext context, java.lang.Integer index) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Column", cursor, context, index);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode RowId(
      SQLiteVirtualTableCursor cursor, AtomicReference<java.lang.Long> rowId) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("RowId", cursor, new NRef(rowId));
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Update(
      SQLiteVirtualTable table, SQLiteValue[] values, AtomicReference<java.lang.Long> rowId) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Update", table, new Object[] {values}, new NRef(rowId));
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public SQLiteErrorCode Rename(SQLiteVirtualTable table, java.lang.String newName) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Data.SQLite.ISQLiteManagedModule")
              .invoke("Rename", table, newName);
      if (res == null) return null;
      return SQLiteErrorCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
