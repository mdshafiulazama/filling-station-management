package Interfaces;
import java.lang.*;
import Classes.Oil;
/* GROUP- 3
SEC E 
LAB PROJECT*/

public interface CustomerOperations
{
	boolean insertOil(Oil o);
	boolean removeOil(Oil o);
	Oil searchOil(String tranNo);
	void showAllOils();
}