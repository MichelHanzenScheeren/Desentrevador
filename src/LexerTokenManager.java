/* Generated By:JJTree&JavaCC: Do not edit this line. LexerTokenManager.java */
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

/** Token Manager. */
public class LexerTokenManager implements LexerConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1000000000L) != 0L)
         {
            jjmatchedKind = 46;
            return 10;
         }
         if ((active0 & 0x1f6e7ca00000L) != 0L)
         {
            jjmatchedKind = 46;
            return 13;
         }
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 47;
            return 15;
         }
         if ((active0 & 0x400000L) != 0L)
            return 13;
         return -1;
      case 1:
         if ((active0 & 0x6820200000L) != 0L)
            return 13;
         if ((active0 & 0x1f165c800000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 46;
               jjmatchedPos = 1;
            }
            return 13;
         }
         if ((active0 & 0x8000000000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 47;
               jjmatchedPos = 1;
            }
            return 15;
         }
         return -1;
      case 2:
         if ((active0 & 0x1f4644800000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 2;
            return 13;
         }
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 2;
            return 15;
         }
         if ((active0 & 0x1018000000L) != 0L)
            return 13;
         return -1;
      case 3:
         if ((active0 & 0x1f4640800000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 3;
            return 13;
         }
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 3;
            return 15;
         }
         if ((active0 & 0x4000000L) != 0L)
            return 13;
         return -1;
      case 4:
         if ((active0 & 0xb0640800000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 4;
            return 13;
         }
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 4;
            return 15;
         }
         if ((active0 & 0x144000000000L) != 0L)
            return 13;
         return -1;
      case 5:
         if ((active0 & 0x30600800000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 5;
            return 13;
         }
         if ((active0 & 0x80040000000L) != 0L)
            return 13;
         if ((active0 & 0x8000000000L) != 0L)
            return 15;
         return -1;
      case 6:
         if ((active0 & 0x20600800000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 6;
            return 13;
         }
         if ((active0 & 0x10000000000L) != 0L)
            return 13;
         return -1;
      case 7:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 7;
            return 13;
         }
         if ((active0 & 0x20400800000L) != 0L)
            return 13;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 10:
         return jjStopAtPos(0, 24);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 40:
         return jjStopAtPos(0, 31);
      case 41:
         return jjStopAtPos(0, 32);
      case 42:
         return jjStopAtPos(0, 11);
      case 43:
         return jjStopAtPos(0, 9);
      case 44:
         return jjStopAtPos(0, 25);
      case 45:
         return jjStopAtPos(0, 10);
      case 47:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_0(0x30L);
      case 60:
         return jjMoveStringLiteralDfa1_0(0x140000L);
      case 61:
         jjmatchedKind = 14;
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 62:
         jjmatchedKind = 17;
         return jjMoveStringLiteralDfa1_0(0x80000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 94:
         return jjStopAtPos(0, 13);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x810000000L);
      case 101:
         return jjStartNfaWithStates_0(0, 22, 13);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x80200000000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 113:
         return jjMoveStringLiteralDfa1_0(0x20000000000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x10400000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x6000000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x40004000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x100000000000L);
      default :
         return jjMoveNfa_0(4, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         break;
      case 42:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 47:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(1, 4);
         break;
      case 61:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         else if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x100018800000L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 101:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(1, 29, 13);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(1, 35, 13);
         else if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x14400000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x80200000000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x48000000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L);
      case 117:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(1, 21, 13);
         return jjMoveStringLiteralDfa2_0(active0, 0x20040000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      case 101:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 13);
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000000L);
      case 104:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 13);
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 105:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(2, 28, 13);
         break;
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x4040000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x48000000000L);
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000000L);
      case 113:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 122:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      case 101:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 13);
         return jjMoveStringLiteralDfa4_0(active0, 0x400800000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x180000000000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x48000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 72:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 97:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 42, 13);
         return jjMoveStringLiteralDfa5_0(active0, 0x8040000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000L);
      case 111:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 38, 13);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 44, 13);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x20200000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000000L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000000L);
      case 111:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(5, 30, 13);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 43, 13);
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      case 114:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 39, 15);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa7_0(active0, 0x400000000L);
      case 100:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000000000L);
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000L);
      case 111:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 40, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000000L);
      case 101:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(7, 23, 13);
         break;
      case 111:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(7, 34, 13);
         else if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 41, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 111:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(8, 33, 13);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 37;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 10:
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjCheckNAdd(13);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 51)
                        kind = 51;
                     jjCheckNAddTwoStates(16, 17);
                  }
                  else if (curChar == 39)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 34)
                     jjCheckNAddStates(3, 5);
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAddTwoStates(16, 17);
                  break;
               case 17:
                  if (curChar == 46)
                     jjCheckNAdd(18);
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 51)
                     kind = 51;
                  jjCheckNAdd(18);
                  break;
               case 19:
                  if (curChar == 34)
                     jjCheckNAddStates(3, 5);
                  break;
               case 20:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 22:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 23:
                  if (curChar == 34 && kind > 53)
                     kind = 53;
                  break;
               case 24:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(6, 9);
                  break;
               case 25:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 26:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 27:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(25);
                  break;
               case 28:
                  if (curChar == 39)
                     jjCheckNAddStates(0, 2);
                  break;
               case 29:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 31:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 32:
                  if (curChar == 39 && kind > 53)
                     kind = 53;
                  break;
               case 33:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(10, 13);
                  break;
               case 34:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 35:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 36:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(34);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 10:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                     jjCheckNAdd(13);
                  }
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 4:
                  if ((0x7fffffe80000000L & l) != 0L)
                  {
                     if (kind > 46)
                        kind = 46;
                     jjCheckNAdd(13);
                  }
                  else if ((0x7fffffeL & l) != 0L)
                  {
                     if (kind > 47)
                        kind = 47;
                     jjCheckNAdd(15);
                  }
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 10;
                  else if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 0:
                  if (curChar == 111 && kind > 45)
                     kind = 45;
                  break;
               case 1:
                  if (curChar == 115)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 2:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 3:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 5:
                  if (curChar == 97 && kind > 45)
                     kind = 45;
                  break;
               case 6:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 100)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 11:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if ((0x7fffffe80000000L & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjCheckNAdd(13);
                  break;
               case 13:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 46)
                     kind = 46;
                  jjCheckNAdd(13);
                  break;
               case 14:
                  if ((0x7fffffeL & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(15);
                  break;
               case 15:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 47)
                     kind = 47;
                  jjCheckNAdd(15);
                  break;
               case 20:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 21:
                  if (curChar == 92)
                     jjAddStates(14, 16);
                  break;
               case 22:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 29:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 30:
                  if (curChar == 92)
                     jjAddStates(17, 19);
                  break;
               case 31:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 20:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 5);
                  break;
               case 29:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 37 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_2(0x80L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_2(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 47:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      default :
         return 2;
   }
   return 2;
}
static private int jjMoveStringLiteralDfa0_1()
{
   return jjMoveNfa_1(0, 0);
}
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 3;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x2400L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                  }
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if (curChar == 10 && kind > 6)
                     kind = 6;
                  break;
               case 2:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 3 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   29, 30, 32, 20, 21, 23, 20, 21, 25, 23, 29, 30, 34, 32, 22, 24, 
   26, 31, 33, 35, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, "\53", "\55", "\52", 
"\57", "\136", "\75", "\75\75", "\41\75", "\76", "\74\40", "\76\75", "\74\75", 
"\157\165", "\145", "\160\141\162\145\110\157\155\145", "\12", "\54", "\164\143\150\145", 
"\142\141\150", "\144\141\151", "\156\145", "\146\165\156\143\141\157", "\50", "\51", 
"\154\157\161\165\145\141\156\144\157", "\162\145\160\145\164\145\143\157", "\144\145", "\141\164\145", "\163\145", 
"\163\145\156\141\157", "\124\162\157\166\141\162", "\162\145\144\157\156\144\157", 
"\161\165\145\142\162\141\144\157", "\164\162\157\166\141", "\154\157\147\151\143\157", "\166\141\172\151\157", 
null, null, null, null, null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "IN_SINGLE_LINE_COMMENT",
   "IN_MULTI_LINE_COMMENT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, 1, 2, 0, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0x28fffffffffe01L, 
};
static final long[] jjtoSkip = {
   0xceL, 
};
static final long[] jjtoSpecial = {
   0xc0L, 
};
static final long[] jjtoMore = {
   0x130L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[37];
static private final int[] jjstateSet = new int[74];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public LexerTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public LexerTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 37; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 3 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002200L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         if (jjmatchedPos == 0 && jjmatchedKind > 8)
         {
            jjmatchedKind = 8;
         }
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 8)
         {
            jjmatchedKind = 8;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        jjimageLen += jjmatchedPos + 1;
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
     }
     int error_line = input_stream.getEndLine();
     int error_column = input_stream.getEndColumn();
     String error_after = null;
     boolean EOFSeen = false;
     try { input_stream.readChar(); input_stream.backup(1); }
     catch (java.io.IOException e1) {
        EOFSeen = true;
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
        if (curChar == '\n' || curChar == '\r') {
           error_line++;
           error_column = 0;
        }
        else
           error_column++;
     }
     if (!EOFSeen) {
        input_stream.backup(1);
        error_after = curPos <= 1 ? "" : input_stream.GetImage();
     }
     throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
   }
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
