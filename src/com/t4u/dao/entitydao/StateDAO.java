package com.t4u.dao.entitydao;

import java.util.List;

import com.t4u.bean.Country;
import com.t4u.bean.State;

public interface StateDAO {

	public List<State>getStates(Country country);
}
