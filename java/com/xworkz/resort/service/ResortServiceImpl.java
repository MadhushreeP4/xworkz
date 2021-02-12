package com.xworkz.resort.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.xworkz.resort.dao.ResortDAO;
import com.xworkz.resort.dto.ResortDTO;

public class ResortServiceImpl implements ResortService {

	private ResortDAO resortDAO;

	public ResortServiceImpl(ResortDAO dao) {
		System.out.println("created ResortServiceImpl");

		this.resortDAO = dao;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("invoked validateAndSave");

		boolean validate = false;

		if (dto != null) {
			System.out.println("dto is not null, can validate");

			String name = dto.getName();

			Pattern p = Pattern.compile("[^A-Za-z0-9]");
			Matcher m = p.matcher(name);

			if (name != null && !name.isEmpty() && !name.contains(" ") && name.length() >= 3 && name.length() <= 15
					&& !m.find()) {
				System.out.println("Resort name is valid");
				validate = true;
			} else {
				System.out.println("Resort name is not valid");
				validate = false;
			}

			if (validate) {
				String location = dto.getLocation();
				if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 15) {
					System.out.println("location is valid");
					validate = true;
				} else {
					System.out.println("location is not valid");
					validate = false;
				}
			}

			if (validate) {
				String manager = dto.getManagerName();
				if (manager != null && !manager.isEmpty() && manager.length() >= 3 && manager.length() <= 12) {
					System.out.println("manager name is valid");
					validate = true;
				} else {
					System.out.println("manager is not valid");
					validate = false;
				}

			}

			if (validate) {
				double price = dto.getPricePerHead();
				if (price >= 999 && price <= 2500) {
					System.out.println("price is valid");
					validate = true;
				} else {
					System.out.println("price is not valid");
				}
			}

			if (validate) {
				float rating = dto.getRating();
				if (rating >= 0 && rating <= 5) {
					System.out.println("rating is valid");
					validate = true;
				} else {
					System.out.println("rating is not valid");
					validate = false;
				}
			}

			if (validate) {
				long number = dto.getPhoneNo();
				int count = 0;
				while (number != 0) {
					number = number / 10;
					count++;
				}
				if (count == 10) {
					System.out.println("number is valid");
					validate = true;
				} else {
					System.out.println("number is not valid");
					validate = false;
				}
			}

			if (validate) {
				int employees = dto.getNoOfEmployees();
				if (employees >= 5 && employees <= 25) {
					System.out.println("employees num is valid");
					validate = true;
				} else {
					System.out.println("employees num is not valid");
					validate = false;
				}
			}
			if (validate) {
				System.out.println("dto is valid, can invoke save");

				this.resortDAO.save(dto);
				validate=true;

			} else {
				System.out.println("dto is not valid");
			}

		} else {
			System.out.println("dto is null");
			validate = false;
		}
		return validate;
	}

	@Override
	public boolean validateAndUpdateLocationByName(String location, String name) {
		System.out.println("invoked validateAndUpdateLocationByName");

		Pattern p = Pattern.compile("[^A-Za-z0-9]");
		Matcher m = p.matcher(name);

		boolean validate = false;

		if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 15) {
			System.out.println("location is valid");
			validate = true;
		} else {
			System.out.println("location is not valid");
			validate = false;
		}

		if (validate) {
			if (name != null && !name.isEmpty() && !name.contains(" ") && name.length() >= 3 && name.length() <= 15
					&& !m.find()) {
				System.out.println("name is valid");
				validate = true;
			} else {
				System.out.println("name is not valid");
				validate = false;
			}
		}

		if (validate) {
			System.out.println("validation is done, can invoke updateLocationByName");

			this.resortDAO.updateLocationByName(location, name);
		}

		return false;
	}

	@Override
	public boolean validateAndUpdateLocationByNameAndRating(String location, String name, float rating) {
		System.out.println("invoked validateAndUpdateLocationByNameAndRating");

		boolean validate = false;

		if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 15) {
			System.out.println("location is valid");
			validate = true;
		} else {
			System.out.println("location is not valid");
			validate = false;
		}

		if (validate) {
			Pattern p = Pattern.compile("[^A-Za-z0-9]");
			Matcher m = p.matcher(name);

			if (name != null && !name.isEmpty() && !name.contains(" ") && name.length() >= 3 && name.length() <= 15
					&& !m.find()) {
				System.out.println("name is valid");
				validate = true;
			} else {
				System.out.println("name is not valid");
				validate = false;
			}
		}

		if (validate) {
			if (rating >= 0 && rating <= 5) {
				System.out.println("rating is valid");
				validate = true;
			} else {
				System.out.println("rating is not valid");
				validate = false;
			}
		}

		if (validate) {
			System.out.println("validation is done, can invoke updateLocationByNameAndRating");

			this.resortDAO.updateLocationByNameAndRating(location, name, rating);
		}
		return false;
	}

	@Override
	public boolean validateAndDeleteByNameAndLocation(String name, String location) {
		System.out.println("invoked validateAndDeleteByNameAndLocation");

		boolean validate = false;

		Pattern p = Pattern.compile("[^A-Za-z0-9]");
		Matcher m = p.matcher(name);

		if (name != null && !name.isEmpty() && !name.contains(" ") && name.length() >= 3 && name.length() <= 15
				&& !m.find()) {
			System.out.println("name is valid");
			validate = true;
		} else {
			System.out.println("name is not valid");
			validate = false;
		}

		if (validate) {
			if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 15) {
				System.out.println("location is valid");
				validate = true;
			} else {
				System.out.println("location is not valid");
				validate = false;
			}
		}

		if (validate) {
			System.out.println("validation is done,can invoke deleteByNameAndLocation");

			this.resortDAO.deleteByNameAndLocation(name, location);
		}

		return false;
	}

	@Override
	public boolean validateAndAddMultipleResorts(List<ResortDTO> dtos) {
		System.out.println("invoked validateAndAddMultipleResorts");

		boolean valid = false;
		if (dtos != null && dtos.size() > 0) {
			int size = dtos.size();
			int tempSize = 0;
			for (ResortDTO resortDTO : dtos) {
				System.out.println(resortDTO);
				boolean saved = this.validateAndSave(resortDTO);
				System.out.println(saved);
				if (!saved) {
					// print dto not added
					System.out.println("dto not added");
					valid=false;
				} else {
					System.out.println("dto added");
					tempSize++;
					valid=true;
				}
				if(tempSize==size)
				{
					System.out.println("validation is done");
					valid=true;
				}

			}
			
		}

		return valid;
	}

	@Override
	public int validateAndGetTotalResortSize() {
		System.out.println("invoked validateAndGetTotalResortSize");

		return this.resortDAO.totalResortSize();
	}

	@Override
	public List<ResortDTO> validateAndGetAll() {
		System.out.println("invoked validateAndGetAll");

		return this.resortDAO.getAll();
	}

}
